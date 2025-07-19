import java.util.ArrayList;

/**ADT ที่เก็บ Number  แบบไม่ซ้ำกันและเรียงลำดับจากน้อยไปมาก
 */
public class IntegerSet {
    ArrayList<Integer> Number;

     // Rep Invariant (RI):
    //  - Number ห้ามเป็น null
    //  - Number ห้ามซ้ำกัน
    //  - ใน set ต้องเรียงเลขจากน้อยไปหามาก
   
    // Abstraction Function (AF):
    //  - AF(Number) = the set of Integer in the Integer Number
    public IntegerSet(){
        Number = new ArrayList<>();
        CheckRep();
    }


    /**
     * ตรวจสอบว่า Number เป็น  Null ไหม 
     * ตรวจสอบว่า Set ใน Number เรียงจากน้อยไปมากไหม
     */

    private void CheckRep(){
         if (Number == null) {
           throw new RuntimeException("Number is null");
        }
        if (Number.size() > 1) {
            for (int i = 0; i < Number.size() - 1; i++) {
      
                if (Number.get(i).equals(Number.get(i+1))) {
                    throw new RuntimeException("Have this number");
                }else if (Number.get(i) > Number.get(i+1)) {
                    throw new RuntimeException("Number is not sort");
                 }
       }
        }
     
    }

    /**
     * เพิ่มตัวเลขเข้าเซต
     * @param x ตัวอักษรที่ต้องการเพิ่ม
     */
    public void add(Integer x ){
        Number.add(x);
        CheckRep();
    }
    
    /**
     * ลบตัวเลขออกจากเซต
     * @param x ตัวอักษรที่ต้องการลบ
     */
    public void remove(Integer x ){
        
        for (int i = 0; i < Number.size(); i++) {
              
             
            if (x == Number.get(i)) {

                  Number.remove(x);

            }
        }
      
         CheckRep();
    }

     /**
     * ตรวจสอบว่ามีตัวอักษรนี้อยู่ในเซตหรือไม่
     * @param x ตัวอักษรที่ต้องการตรวจสอบ
     * @return true หากมี x อยู่ในเซต, false หากไม่มี
     */
    public boolean contains(Integer x) {
       for (int i = 0; i < Number.size(); i++) {
        if (x == Number.get(i)) {
            return true;
        }
       }
       return false;
    }

    public String toString(){
        return Number.toString();
    }

}

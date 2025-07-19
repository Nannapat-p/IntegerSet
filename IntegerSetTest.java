

public class IntegerSetTest {
    public static void main(String[] args) {


        
        // Test 1: การสร้าง, เพิ่มข้อมูล, และการเรียงลำดับ
        IntegerSet a = new IntegerSet();
        a.add(50);
        a.add(60);
        a.add(80);
        String Test1 = "[50, 60, 80]";
        if (a.toString().equals(Test1)) {
            System.out.println("Pass : Add number in set");
        }else{
        
            System.out.println("Fail : Cant add number");
        }
        // Test 2:  ลบข้อมูล
        a.remove(60);
          String Test2 = "[50, 80]";
        if (a.toString().equals(Test2)) {
             System.out.println("Pass : Remove correct");
        }else{
        
            System.out.println("Fail : Cant remove ");
        }
        // Test 3: การตรวจสอบข้อมูล (contains)
        if (a.contains(50) ) {
             System.out.println("Pass : Have this number in set");
        } else {
          System.out.println("Fail : Dont have this number in set");  
        }

         // Test 4: ลองเพิ่มแบบตัวเดียว
        a.add(90);
      
        String Test4 = "[50, 80, 90]";
        if (a.toString().equals(Test4)) {
            System.out.println("Pass : Add number in set");
        }else{
        
            System.out.println("Fail : Cant add number");
        }
    }
}

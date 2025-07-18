

public class IntegerSetTest {
    public static void main(String[] args) {


        
        // Test 1: การสร้าง, เพิ่มข้อมูล, และการเรียงลำดับ
        IntegerSet a = new IntegerSet();
        a.add(50);
        a.add(60);
        a.add(80);
        String Test1 = "[50, 60, 80]";
        if (a.toString().equals(Test1)) {
            System.out.println("Pass");
        }else{
        
            System.out.println("Fail");
        }
        // Test 2:  ลบข้อมูล
        a.remove(60);
          String Test2 = "[50, 80]";
        if (a.toString().equals(Test2)) {
             System.out.println("Pass");
        }else{
        
            System.out.println("Fail");
        }
        // Test 3: การตรวจสอบข้อมูล (contains)
        if (a.contains(50) ) {
             System.out.println("Pass");
        } else {
          System.out.println("Fail");  }
    }
}

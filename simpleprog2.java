public class simpleprog2 {
    public static void main(String[] args){
        int age = 20;
        double height = 1.75;
        char grade = 'A';
        boolean isStudent = true;
        String name = "chandana";
        int[] numbers = {12345};
        System.out.println("Name:" +name);
        System.out.println("age:" +age);
        System.out.println("Height:" +height);
        System.out.println("grade:" +grade);
        System.out.println("Is student:" +isStudent);
        System.out.println("numbers:");
        for(int num:numbers)
        {
            System.out.println(num+ " ");
        }
        System.out.println();
    }
}

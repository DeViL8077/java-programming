package BasicPrograms;

public class switch_case{
    public static void main(String[] args) {
        int choice=1;
        switch(choice)
        {
                case 0:
                System.out.println("byte");
                System.out.println("8 bit");
                break;

                case 1:
                System.out.println("short");
                System.out.println("16 bit");
                break;

                case 2:
                System.out.println("int");
                System.out.println("32 bit");
                break;

                case 3:
                System.out.println("boolean");
                System.out.println("1 bit: true/false");
                break;

                default:
                System.out.println("Other entry");
                break;
        }
    }
}

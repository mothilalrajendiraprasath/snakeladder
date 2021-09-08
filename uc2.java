public class UC_2 {
    public static void main(String[] args){
        int position = 0;
        int roll = Math.random(6);
        System.out.println("die number: " +roll);
        while ( roll >= 1 || roll <= 6 )
            position += roll;
        System.out.println("position update: " + position);
    }
}


public class CustomerOrders {

    private String command;
    private int money;

    //Constructeur
    public CustomerOrders(String command, int money){
        this.command = command;
        this.money = money; //en cents
    }


    public String drinkMakerMessage() {
        String splitedCommand[] = this.command.split(":", -1);
        String drinks ="", suggarAndStick ="", message ="";
        int missing = 0;

        if(splitedCommand[0].equals("T") && this.money >= 40){
            drinks = "tea";
        }else if(splitedCommand[0].equals("H") && this.money >= 50){
            drinks = "chocolate";
        }else if(splitedCommand[0].equals("C") && this.money >= 60){
            drinks = "coffee";
        }else if(splitedCommand[0].equals("O") && this.money >= 60){
            drinks = "orange juice";
        }else if(splitedCommand[0].equals("Th") && this.money >= 40){
            drinks = "extra hot tea";
        }else if(splitedCommand[0].equals("Hh") && this.money >= 50){
            drinks = "extra hot chocolate";
        }else if(splitedCommand[0].equals("Ch") && this.money >= 60){
            drinks = "extra hot coffee";
        }


        if(splitedCommand[1].equals("") && !splitedCommand[0].equals("O")){
            suggarAndStick = " with no sugar - and therefore no stick";
        }

        if(splitedCommand[1].equals("1")){
            suggarAndStick = " with 1 sugar and a stick";
        }

        if(splitedCommand[1].equals("2")){
            suggarAndStick = " with 2 sugars and a stick";
        }

        if(drinks == "") {
            if(splitedCommand[0].equals("T") || splitedCommand[0].equals("Th")) {
                missing = 40 - this.money;
            }

            if(splitedCommand[0].equals("H") || splitedCommand[0].equals("Hh")) {
                missing = 50 - this.money;
            }

            if(splitedCommand[0].equals("C") || splitedCommand[0].equals("O") || splitedCommand[0].equals("Ch")) {
                missing = 60 - this.money;
            }

            return message = "Missing "+missing+" cents";

        }else {
            return message = "Drink maker makes 1 "+drinks+suggarAndStick;
        }
    }

}

class UsingSwitch{
    static String getDay(int num){
      String day="";
      switch(num){
          case 1: 
              day="Понедельник ";
              break;
          case 2: 
              day="Вторник ";
              break;
          case 3: 
              day="Среда ";
              break;
          case 4: 
              day="Четверг ";
              break;
          case 5: 
              day="Пятница ";
              break;
          case 6: 
              day="Суббота ";
              break;
          case 7: 
              day="Воскресенье ";
              break;
          default:
              day="Вы вышли за пределы реальности ";                                                  
      }
      
      return day;
    }
    static String workOrSleep(int num){
        String whatToDo ="";
        switch(num){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                whatToDo="Работать(";
                break;
            case 6:
            case 7:
                whatToDo="Спать)))";
                break;
            default:
                whatToDo="Ну и чего ты ещё хочещь?";
        }
        return whatToDo;
    }
}





/**
 *
 * @author LightOfDead
 */
public class UsingSwitchWithFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0;i<=8;i++){
            System.out.println(UsingSwitch.getDay(i)+"ну значит "+UsingSwitch.workOrSleep(i));
        }
    }
    
}

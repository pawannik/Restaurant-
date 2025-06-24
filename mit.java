public class Main {
  public static void main(String[] args) {
    int num1 = 4;
    ;int num2 = 20;
    char operator = '%'; //Change to '+', '-', '*', '/','%'
    int result;
    switch (operator) {
      case '+':
      result = num1+num2;
        System.out.println("Result:" + result);
        break;
             case '-':
      result = num1-num2;
        System.out.println("Result:" + result);
        break;
               case '/':
          if(num2!=0){
      result = num1/num2;
        System.out.println("Result:" + result);
        }else{
        System.out.println("Error Division by zero");
        }
        break;
              case '%':
          if(num2!=0){
      result = num1%num2;
        System.out.println("Result:" + result);
        }else{
        System.out.println("Error Division by zero");
        }
        break;
        default:
        System.out.println("Invalid operator");
        }
        }
        }
        

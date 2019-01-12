import javax.swing.JOptionPane;

public class ThreeTwenty {
 public static void main(String[] args) {
   
     String input1 = JOptionPane.showInputDialog("What is the temperature in Fahrenheit between -58F and 41F? ");
     double temp = Double.parseDouble(input1);
     
     String input2 = JOptionPane.showInputDialog("What is the wind speed in miles per hour? ");
     double wind = Double.parseDouble(input2);
     
     
     double power1 = Math.pow(wind, 0.16);
     double power2 = Math.pow(wind, 0.16);
     double num2 = 0.4275 * (temp * power2);
     double formula = 35.74 + (0.6215*temp) - (35.75 * power1) + num2;
     
     if (temp < -58 || temp > 41 && wind < 2){
         if (wind >= 2){
             JOptionPane.showMessageDialog(null, "Temperature is not valid.");
         }
         else if(wind <2){
             JOptionPane.showMessageDialog(null, "Temperature and wind speed are not valid.");
     }}
     else if (temp >= -58 || temp <= 41) {
         if (wind < 2) {
         JOptionPane.showMessageDialog(null, "Wind speed is not valid.");
     } else if (wind >= 2) {
          JOptionPane.showMessageDialog(null, "The wind chill index is " + formula +".");
     }
     }
 }}

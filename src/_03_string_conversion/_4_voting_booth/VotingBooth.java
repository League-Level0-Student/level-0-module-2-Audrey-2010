package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String ageToVote=JOptionPane.showInputDialog(null, "Hello! Here to vote? How old are you?");
int ageAsInt=Integer.parseInt(ageToVote);

if(ageAsInt<18) {
	
JOptionPane.showMessageDialog(null, "You're not old enough to vote!");	
	
	

}
if(ageAsInt>=18) {
	
String President=JOptionPane.showInputDialog(null, "Who do you want to be the next president?");
	
JOptionPane.showMessageDialog(null,"Thanks for your feedback! We'll make sure to tell you who wins soon!");
}
}
}

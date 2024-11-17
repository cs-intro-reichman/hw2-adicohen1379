public class TimeCalc {
    public static void main(String[] args) {
        Integer hours=Integer.parseInt(""+args[0].charAt(0)+args[0].charAt(1));
		Integer minuts=Integer.parseInt(""+args[0].charAt(3)+args[0].charAt(4));
		Integer minToAdd=Integer.parseInt(args[1]);
		Integer totalMin=(hours*60)+minuts+minToAdd;
		Integer totalHours=totalMin/60;
		Integer newHours=totalHours%24;
		Integer newMinuts=totalMin-(60*totalHours);
		if(newHours<10&&newMinuts<10)
			System.out.println("0"+newHours+":"+"0"+newMinuts);
		if(newHours<10&&(newMinuts>10||newMinuts==10))
			System.out.println("0"+newHours+":"+newMinuts);
		if(newMinuts<10&&(newHours>10||newHours==10))
			System.out.println(newHours+":"+"0"+newMinuts);
		if((newMinuts>10||newMinuts==10)&&(newHours>10||newHours==10))
		System.out.println(newHours+":"+newMinuts);
    }
}

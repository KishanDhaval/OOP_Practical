class Que3{

public static void main(String a[]){

	StringBuffer sb = new StringBuffer("hello");
	sb.append(" world");
	System.out.println("after append\t"+sb);
	sb.insert(5," k");
	System.out.println("after insert\t"+sb);
	sb.replace(5,7," No");
	System.out.println("after replace\t"+sb);
	sb.delete(0,6);
	System.out.println("after delete\t"+sb);
	sb.reverse();
	System.out.println("after reverse\t"+sb);
	System.out.println("after size\t"+sb.length());
}
}
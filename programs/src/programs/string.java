package programs;

public class string {
public static void main(String args[]) {
	String s="InformationTechnology";
	String m="SeleniumAutomationtool";
	String n="Automation";
	String p="J a v a p r o g r a m";
	String h="9988665510";
	System.out.println(s.length());
	System.out.println(m.length());
	System.out.println(n.length());
	System.out.println(p.length());
	System.out.println(h.length());
	System.out.println(s.lastIndexOf('o'));
	System.out.println(m.indexOf('o'));
	System.out.println(n.indexOf('n'));
	System.out.println(p.lastIndexOf('_'));
	System.out.println(h.indexOf('8'));
	System.out.println(s.charAt(14));
	System.out.println(m.charAt(11));
	System.out.println(n.charAt(1));
	System.out.println(p.charAt(8));
	System.out.println(h.charAt(6));
	String v="Java";
	String b="Java";
	System.out.println(v.contentEquals(b));
	String a="Java";
	String c="java";
	System.out.println(a.contentEquals(c));
	String u="green Technology";
	String j="InformationTechnology";
	System.out.println(u.contentEquals(j));
	String k="Java";
	String l="java";
	System.out.println(k.equalsIgnoreCase(l));
	String d="Viji";
	String f="viji";
	System.out.println(d.equalsIgnoreCase(f));
	String z="AutomationK451@gmail.com";
	System.out.println(z.contains("@"));
	
}
}

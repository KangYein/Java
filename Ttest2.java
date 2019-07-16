public class Ttest2 {

	public static void main(String[] args) {
		String a="Hello",b="hello",c="Hello!";
		System.out.println(a.equals(b));//동일한 값을 가지는지 비교
		System.out.println(a.replace("l","L"));//일치하는 문자를 첫번째 한번 변경
		System.out.println(a.replaceAll("L","l"));//특정 문자를 모두 다른 문자로 바꿈
		System.out.println(a.replaceFirst("l","L"));//처음 나오는 l을 L로 바꿔줌
		System.out.println(b.substring(0,4));//시작지점 0번째:h 4개의 문자
		System.out.println(b.toUpperCase());//모든 소문자를 대문자로
		System.out.println(b.toLowerCase());//모든 대문자를 소문자로
		System.out.println(c.charAt(1));//인덱스 요소를 반환
		System.out.println(c.concat("bit21"));//매개변수와 현재의 문자열을 합침
		System.out.println(a.length());//문자열의 길이를 반환
	}

}
package abstract_class;

public class HttpServletExam {

	public static void main(String[] args) {

		// 왼쪽 부모 오른쪽이 자식
		HttpServlet servlet = new LoginServlet();
		method(servlet()); // 로그인합니다
		method(new FileDownloadServlet()); // 파일 다운로드합니다
	}


	private static HttpServlet servlet() {
		// TODO Auto-generated method stub
		return null;
	}


	public static void method(HttpServlet servlet) {

		servlet.service();

	}
}



package src;

public class JenkinsApp {
    public JenkinsApp () {
    }

    public String getName() {
        return "jenkins";
    }

    public static void main(String[] args) {
        String result = new JenkinsApp().getName();
        System.out.println(result);
    }
}

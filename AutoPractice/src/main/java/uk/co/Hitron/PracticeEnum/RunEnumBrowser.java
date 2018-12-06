package uk.co.Hitron.PracticeEnum;

public class RunEnumBrowser
{
    public static void main(String[] args) {
        EnumBrowser enumBrowser = new EnumBrowser();
        String myBrowser = enumBrowser.getBrowser(WebBrowsers.Chrome);
        System.out.println(myBrowser);
    }
}

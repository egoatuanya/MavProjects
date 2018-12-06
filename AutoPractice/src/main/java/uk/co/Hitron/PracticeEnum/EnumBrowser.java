package uk.co.Hitron.PracticeEnum;

import static uk.co.Hitron.PracticeEnum.WebBrowsers.Chrome;

public class EnumBrowser {
    public String getBrowser(WebBrowsers browser) {
        switch (browser) {
            case Chrome:
                return "Google Chrome";
            case FireFox:
                return "Mozilla FireFox";
            case InternetExplorer:
                return "Microsoft Internet Explorer";
            case MicrosoftEdge:
                return "Microsoft Edge";
            case Safari:
                return "Apple Safari";
        }
        return "Use Google Chrome";
    }



}

public class SignedText {
    private String name1;
    private String name2;

    public SignedText(String n1, String n2) {
        name1 = n1;
        name2 = n2;
    }

    public String getSignature() {
        if (name1.length() == 0) {
            return name2;
        } else {
            return name1.substring(0,1) + "-" + name2;
        }

    }

    public String addSignature(String text) {
        int index = text.indexOf(getSignature());
        if (index == 0 ) { //begin
            return text.substring(getSignature().length()) + getSignature();
        } else if (index == -1) { //none
            return text + getSignature();
        } else { //end
            return text;
        }

    }


}

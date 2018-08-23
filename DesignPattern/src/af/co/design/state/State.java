package af.co.design.state;

import af.co.design.utils.Log;

public class State {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1(){
        Log.d("Exec the first opt!");
    }

    public void method2(){
        Log.d("Exec the second opt!");
    }

    public void methodDefault(){
        Log.d("Exec the default opt!");
    }
}

package apptwo.googleknight.learn.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.w3c.dom.Text;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView=(TextView)findViewById(R.id.textView);
        Button num0=(Button)findViewById(R.id.button0);
        Button num1=(Button)findViewById(R.id.button1);
        Button num2=(Button)findViewById(R.id.button2);
        Button num3=(Button)findViewById(R.id.button3);
        Button num4=(Button)findViewById(R.id.button4);
        Button num5=(Button)findViewById(R.id.button5);
        Button num6=(Button)findViewById(R.id.button6);
        Button num7=(Button)findViewById(R.id.button7);
        Button num8=(Button)findViewById(R.id.button8);
        Button num9=(Button)findViewById(R.id.button9);
        Button signplus=(Button)findViewById(R.id.button10);
        Button signminus=(Button)findViewById(R.id.button11);
        Button signmul=(Button)findViewById(R.id.button12);
        Button signdiv=(Button)findViewById(R.id.button13);
        Button signdot=(Button)findViewById(R.id.button14);
        Button signequal=(Button)findViewById(R.id.button15);
        Button del=(Button)findViewById(R.id.delbutton);
        Button clr=(Button)findViewById(R.id.clrbutton);
        Button mod=(Button)findViewById(R.id.modbutton);

        clr.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                textView.setText("0");
            }
        });

        del.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String temp=textView.getText().toString();
                if(temp.length()>1)
                    textView.setText(temp.substring(0,temp.length()-1));
                else
                    textView.setText("0");
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {    //For OnClick Event
            public void onClick(View v) {
                String temp=textView.getText().toString();
                if(temp.charAt(0)=='0')
                    temp="0";
                else
                    temp+="0";
                textView.setText(temp);
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {    //For OnClick Event
            public void onClick(View v) {
                String temp=textView.getText().toString();
                if(temp.charAt(0)=='0')
                    temp="1";
                else
                    temp+="1";
                textView.setText(temp);
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {    //For OnClick Event
            public void onClick(View v) {
                String temp=textView.getText().toString();
                if(temp.charAt(0)=='0')
                    temp="2";
                else
                    temp+="2";
                textView.setText(temp);
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {    //For OnClick Event
            public void onClick(View v) {
                String temp=textView.getText().toString();
                if(temp.charAt(0)=='0')
                    temp="3";
                else
                    temp+="3";
                textView.setText(temp);
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {    //For OnClick Event
            public void onClick(View v) {
                String temp=textView.getText().toString();
                if(temp.charAt(0)=='0')
                    temp="4";
                else
                    temp+="4";
                textView.setText(temp);
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {    //For OnClick Event
            public void onClick(View v) {
                String temp=textView.getText().toString();
                if(temp.charAt(0)=='0')
                    temp="5";
                else
                    temp+="5";
                textView.setText(temp);
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {    //For OnClick Event
            public void onClick(View v) {
                String temp=textView.getText().toString();
                if(temp.charAt(0)=='0')
                    temp="6";
                else
                    temp+="6";
                textView.setText(temp);
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {    //For OnClick Event
            public void onClick(View v) {
                String temp=textView.getText().toString();
                if(temp.charAt(0)=='0')
                    temp="7";
                else
                    temp+="7";
                textView.setText(temp);
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {    //For OnClick Event
            public void onClick(View v) {
                String temp=textView.getText().toString();
                if(temp.charAt(0)=='0')
                    temp="8";
                else
                    temp+="8";
                textView.setText(temp);
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {    //For OnClick Event
            public void onClick(View v) {
                String temp=textView.getText().toString();
                if(temp.charAt(0)=='0')
                    temp="9";
                else
                    temp+="9";
                textView.setText(temp);
            }
        });
        signplus.setOnClickListener(new View.OnClickListener() {    //For OnClick Event
            public void onClick(View v) {
                String temp=textView.getText().toString();
                if(temp.charAt(0)!='0')
                    temp+="+";
                textView.setText(temp);
            }
        });
        signminus.setOnClickListener(new View.OnClickListener() {    //For OnClick Event
            public void onClick(View v) {
                String temp=textView.getText().toString();
                if(temp.charAt(0)!='0')
                    temp+="-";
                textView.setText(temp);
            }
        });
        signmul.setOnClickListener(new View.OnClickListener() {    //For OnClick Event
            public void onClick(View v) {
                String temp=textView.getText().toString();
                if(temp.charAt(0)!='0')
                    temp+="*";
                textView.setText(temp);
            }
        });
        signdiv.setOnClickListener(new View.OnClickListener() {    //For OnClick Event
            public void onClick(View v) {
                String temp=textView.getText().toString();
                if(temp.charAt(0)!='0')
                    temp+="/";
                textView.setText(temp);
            }
        });
        signdot.setOnClickListener(new View.OnClickListener() {    //For OnClick Event
            public void onClick(View v) {
                String temp=textView.getText().toString();
                temp+=".";
                textView.setText(temp);
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {    //For OnClick Event
            public void onClick(View v) {
                String temp=textView.getText().toString();
                temp+="%";
                textView.setText(temp);
            }
        });
        signequal.setOnClickListener(new View.OnClickListener()
        {    //For OnClick Event
            public void onClick(View v) {
                String temp=textView.getText().toString();
                Stack expr =new Stack();
                float ans=0;
                for(int i=0;i<temp.length();i++)
                {
                    char ch=' ';
                    if(temp.charAt(i)=='+' ||temp.charAt(i)=='-'||temp.charAt(i)=='*'||temp.charAt(i)=='/' )
                        ch=temp.charAt(i++);
                    if(temp.charAt(i)>='0' && temp.charAt(i)<='9')
                    {
                        int tempi=i;
                        while(temp.charAt(i)>='0' && temp.charAt(i)<='9' ||temp.charAt(i)=='.')
                        {
                            if(++i>=temp.length())
                                break;
                        }
                        float num=Float.parseFloat(temp.substring(tempi,i));
                        expr.push(new Float(num));
                        --i;
                    }
                    if(ch!=' ')
                    {
                        float num2=((Float)expr.pop()).floatValue();
                        float num1=((Float)expr.pop()).floatValue();
                        switch (ch){
                            case '+':
                                ans=num1+num2;
                                break;
                            case '-':
                                ans=num1-num2;
                                break;
                            case '*':
                                ans=num1*num2;
                                break;
                            case '/':
                                if(num2==0)
                                    ans=0;
                                else
                                    ans=num1/num2;
                                break;
                            case '%':
                                ans=num1%num2;
                                break;
                        }
                        expr.push(new Float(ans));
                    }
                }
                ans=(float)expr.pop();
                textView.setText(""+ans);
        }});



    }
}

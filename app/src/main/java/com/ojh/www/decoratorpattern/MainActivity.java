package com.ojh.www.decoratorpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.ojh.www.decoratorpattern.beverage.Beverage;
import com.ojh.www.decoratorpattern.beverage.Espresso;
import com.ojh.www.decoratorpattern.beverage.HouseBlend;
import com.ojh.www.decoratorpattern.decorator.Mocha;
import com.ojh.www.decoratorpattern.decorator.Soy;
import com.ojh.www.decoratorpattern.decorator.Whip;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    Beverage beverage;

    @BindView(R.id.tvResult)
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnEspresso, R.id.btnHouseBlend})
    public void onClickBeverage(View view) {
        switch (view.getId()) {
            case R.id.btnEspresso:
                beverage = new Espresso();
                break;
            case R.id.btnHouseBlend:
                beverage = new HouseBlend();
                break;
        }

        printToast(beverage.getDescription());
    }

    @OnClick({R.id.btnMocha, R.id.btnSoy, R.id.btnWhip})
    public void onClickDecorator(View view) {
        if (beverage != null) {
            switch (view.getId()) {
                case R.id.btnMocha:
                    beverage = new Mocha(beverage);
                    break;
                case R.id.btnSoy:
                    beverage = new Soy(beverage);
                    break;
                case R.id.btnWhip:
                    beverage = new Whip(beverage);
                    break;
            }

            printToast(beverage.getDescription());
        }
    }

    @OnClick(R.id.btnOrder)
    public void onClickOrder() {
        if(beverage != null) {
            tvResult.setText(beverage.getDescription() + " = $" + beverage.cost());
        }
    }

    public void printToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }


}

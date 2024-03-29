package jac.cookhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onAddRecipe(View v) {
        Intent intent = new Intent(v.getContext(), AddRecipeActivity.class);
        startActivityForResult(intent, 0);
    }

    public void onDisplayRecipe(View v){
        Intent intent = new Intent(v.getContext(), DisplayRecipeActivity.class);
        startActivityForResult(intent, 1);
    }

    public void onMyRecipes(View w){
        Intent intent = new Intent(w.getContext(), MyRecipes.class);
        startActivityForResult(intent, 3);
    }

    public void onSearch(View w){
        Intent intent = new Intent(w.getContext(), SearchActivity.class);
        startActivityForResult(intent, 2);
    }

}

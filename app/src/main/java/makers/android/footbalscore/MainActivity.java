package makers.android.footbalscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    int quantityScoreA = 0;
    int quantityScoreB = 0;
    String quarter = "";
    int countQuarter = 0;

    TextView scoreA;
    TextView scoreB;
    TextView breakAB;
    TextView board;
    Button reset;
    Button breakBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreA = (TextView) findViewById(R.id.TVscoreA);
        scoreB = (TextView) findViewById(R.id.TVscoreB);
        reset = (Button) findViewById(R.id.resetBtn);
        breakAB = (TextView) findViewById(R.id.TVbreak);
        breakBtn = (Button) findViewById(R.id.breakBtn);
        board = (TextView) findViewById(R.id.TVboard);
    }

    public void incrementScore6A(View view) {
        quantityScoreA += 6;
        scoreA.setText("" + quantityScoreA);
    }

    public void incrementScore6B(View view) {
        quantityScoreB += 6;
        scoreB.setText("" + quantityScoreB);
    }

    public void incrementScore3A(View view) {
        quantityScoreA += 3;
        scoreA.setText("" + quantityScoreA);
    }

    public void incrementScore3B(View view) {
        quantityScoreB += 3;
        scoreB.setText("" + quantityScoreB);
    }

    public void incrementScore2A(View view) {
        quantityScoreA += 2;
        scoreA.setText("" + quantityScoreA);
    }

    public void incrementScore2B(View view) {
        quantityScoreB += 2;
        scoreB.setText("" + quantityScoreB);
    }

    public void incrementScoreA(View view) {
        quantityScoreA += 1;
        scoreA.setText("" + quantityScoreA);
    }

    public void incrementScoreB(View view) {
        quantityScoreB += 1;
        scoreB.setText("" + quantityScoreB);
    }

    public void reset(View view) {
        quantityScoreA = 0;
        quantityScoreB = 0;
        scoreA.setText("" + quantityScoreA);
        scoreB.setText("" + quantityScoreB);

    }

    public void breakAction(View view) {

        if (countQuarter < 4) {
            countQuarter += 1;
            quarter = quarter + "Quarter " + countQuarter + "--->" + quantityScoreA + ":" + quantityScoreB + "\n";
            breakAB.setText(quarter);
        } else {
            if (quantityScoreA > quantityScoreB) {
                board.setText("Tim A Winner");
            } else if (quantityScoreA < quantityScoreB) {
                board.setText("Tim B Winner");
            } else {
                board.setText("Draw");
            }
        }
    }


}

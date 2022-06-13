package com.example.career;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private Context mcontext;
    private ArrayList<homeClass> homeClasses;
    private CourseRecyclerAdapter adapter;
    RecyclerView recyclerView;
    CoursesItemClickListener coursesItemClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        recyclerView = findViewById(R.id.rv_courses);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,
                StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(
                layoutManager
        );
        recyclerView.setClipToPadding(false);
        recyclerView.setHasFixedSize(true);

        int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.horizontal_card);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, spacingInPixels, true, 0));

        homeClasses = new ArrayList<>();

        homeClasses.add(new homeClass(1, R.drawable.daily, "Insight of the Day"));
        homeClasses.add(new homeClass(1, R.drawable.weekly, "Weekly Insights"));
        homeClasses.add(new homeClass(1, R.drawable.professions, "Professions"));
        homeClasses.add(new homeClass(1, R.drawable.strength, "Strength Weaknesw"));
        homeClasses.add(new homeClass(1, R.drawable.lovelife, "LoveLife Friendship"));
        homeClasses.add(new homeClass(1, R.drawable.studyyourtype, "Study Your Type"));
        homeClasses.add(new homeClass(1, R.drawable.strength, "Friends Board"));
        homeClasses.add(new homeClass(1, R.drawable.aboutu, "Famous People"));
        homeClasses.add(new homeClass(1, R.drawable.retaketest, "Retake Test"));


        adapter = new CourseRecyclerAdapter(mcontext, homeClasses, coursesItemClickListener);

        recyclerView.setAdapter(adapter);
    }
}
package nttvn.dn.justlikeme;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import nttvn.dn.justlikeme.activity.LoginActivity;
import nttvn.dn.justlikeme.fragment.FragmentList;
import nttvn.dn.justlikeme.fragment.FragmentMaps;
import nttvn.dn.justlikeme.model.Buddy;

public class Home extends AppCompatActivity {

    private static final String TAG = Home.class.getSimpleName();

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Buddy buddy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Check user exist
        buddy = MyApplication.getInstance().getPrefManager().getBuddy();
//        if (buddy == null) {
//            //Next to hashlist screen
//            Intent intent = new Intent(Home.this, LoginActivity.class);
//            startActivity(intent);
//        }
        //Dummy buddy
        if (buddy == null) {
            buddy = new Buddy("1234567890", "Nin Dep Trai");
        }
        MyApplication.getInstance().getPrefManager().storeBuddy(buddy);

        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setTitle(buddy.getName() + " - nearly " + getString(R.string.action_20m));

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.action_20m:
                getSupportActionBar().setTitle(buddy.getName() + " - nearly " + getString(R.string.action_20m));
                break;
            case R.id.action_50m:
                getSupportActionBar().setTitle(buddy.getName() + " - nearly " + getString(R.string.action_50m));
                break;
            case R.id.action_100m:
                getSupportActionBar().setTitle(buddy.getName() + " - nearly " + getString(R.string.action_100m));
                break;
            case R.id.action_edit:
                //Next to hashlist screen
                Intent intent = new Intent(Home.this, LoginActivity.class);
                startActivity(intent);
                break;

        }


        return super.onOptionsItemSelected(item);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentList(), "List");
        adapter.addFragment(new FragmentMaps(), "Map");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

}

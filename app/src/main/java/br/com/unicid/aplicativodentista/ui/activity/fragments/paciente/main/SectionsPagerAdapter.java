package br.com.unicid.aplicativodentista.ui.activity.fragments.paciente.main;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import br.com.unicid.aplicativodentista.ui.activity.fragments.paciente.PacienteAnamneseFragment;
import br.com.unicid.aplicativodentista.ui.activity.fragments.paciente.PacienteConsultasFragment;
import br.com.unicid.aplicativodentista.ui.activity.fragments.paciente.PacienteDadosFragment;
import br.com.unicid.aplicativodentista.R;
import br.com.unicid.aplicativodentista.ui.activity.fragments.paciente.PacienteTratamentosFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tabPaciente_text_1, R.string.tabPaciente_text_2, R.string.tabPaciente_text_3, R.string.tabPaciente_text_4};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new PacienteDadosFragment();
                break;
            case 1:
                fragment = new PacienteAnamneseFragment();
                break;
            case 2:
                fragment = new PacienteTratamentosFragment();
                break;
            case 3:
                fragment = new PacienteConsultasFragment();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 4;
    }
}
package erick.munoz.guerrero.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import erick.munoz.guerrero.fragmentstaller.R;

/**
 * Created by Lenovo-PC on 20/09/2017.
 */

public class FragmentLogin extends Fragment {

    EditText EtUsuario, EtPass;
    Button BtnLogin;
    public FragmentLogin(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vista= inflater.inflate(R.layout.login_fragment,container,false);
        EtUsuario = (EditText) vista.findViewById(R.id.etUsuario);
        BtnLogin = (Button) vista.findViewById(R.id.btnLogin);
        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Hola",Toast.LENGTH_LONG).show();
            }
        });
        return vista;
    }
}

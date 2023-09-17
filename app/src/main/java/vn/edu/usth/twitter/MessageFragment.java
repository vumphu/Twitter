package vn.edu.usth.twitter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

public class MessageFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_message, container, false);
        return view;
    }

    @Override
    public void onResume(){
        super.onResume();
        Toolbar toolbar = requireActivity().findViewById(R.id.toolbar);
        // Get a reference to the ImageView inside the Toolbar
        ImageView logoImage = toolbar.findViewById(R.id.logo_image);
        TextView text = toolbar.findViewById(R.id.mess_title);

        // Hide the ImageView
        text.setVisibility(View.VISIBLE);
        logoImage.setVisibility(View.GONE);
    }
    @Override
    public void onPause(){
        super.onPause();
        // Get a reference to the Toolbar
        Toolbar toolbar = requireActivity().findViewById(R.id.toolbar);
        // Get a reference to the ImageView inside the Toolbar
        ImageView logoImage = toolbar.findViewById(R.id.logo_image);
        TextView text = toolbar.findViewById(R.id.mess_title);

        text.setVisibility(View.GONE);
        logoImage.setVisibility(View.VISIBLE);
    }

    @Override
    public void onStop(){
        super.onStop();
        // Get a reference to the Toolbar
        Toolbar toolbar = requireActivity().findViewById(R.id.toolbar);
        // Get a reference to the ImageView inside the Toolbar
        ImageView logoImage = toolbar.findViewById(R.id.logo_image);
        TextView text = toolbar.findViewById(R.id.mess_title);

        // Show the ImageView
        text.setVisibility(View.GONE);
        logoImage.setVisibility(View.VISIBLE);
    }
}

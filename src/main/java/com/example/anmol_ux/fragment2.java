package com.example.anmol_ux;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.anmol_ux.databinding.Fragment1LayoutBinding;
import com.example.anmol_ux.databinding.Fragment2LayoutBinding;

import org.jetbrains.annotations.NotNull;

public class fragment2 extends Fragment {
    Fragment2LayoutBinding binding;
    int range;
    String  condition;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
       binding = Fragment2LayoutBinding.inflate(getLayoutInflater());
       View view = binding.getRoot();

        return view;
    }
    //seekbar scroller
    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.rangeSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                binding.rangeTV.setText(""+i+ "(in metres)");
                range = i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        binding.conditionSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if(i<32){
                    binding.conditionTV.setText("Normal");
                    condition = "Normal";
                }
                else if(i>32 && i<66){
                    binding.conditionTV.setText("Moderate");
                    condition = "Moderate";
                }
                else{
                    binding.conditionTV.setText("Extreme");
                    condition = "Extreme";
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        binding.continuebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phonenum = binding.phoneET.getText().toString();
                Toast.makeText(getActivity(), ""+range+" "+condition+" "+phonenum, Toast.LENGTH_SHORT).show();
            }
        });
    }

    }

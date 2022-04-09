package com.example.anmol_ux;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.anmol_ux.databinding.Fragment1LayoutBinding;

import org.jetbrains.annotations.NotNull;

public class fragment1 extends Fragment {
    Fragment1LayoutBinding binding;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
       binding = Fragment1LayoutBinding.inflate(getLayoutInflater());
       View view = binding.getRoot();


        return view;
    }
}

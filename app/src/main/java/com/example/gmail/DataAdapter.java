package com.example.gmail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private List<Letter> letters;

    DataAdapter(Context context, List<Letter> letters) {
        this.letters = letters;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.letter_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        Letter letter = letters.get(position);
        holder.letterFrom.setText(letter.letterFrom);
        holder.letterTheme.setText(letter.letterTheme);
        holder.letterBody.setText(letter.letterBody);
        holder.letterDate.setText(letter.letterDate);
    }

    @Override
    public int getItemCount() {
        return letters.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView letterFrom, letterTheme, letterBody, letterDate;
        ViewHolder(View view){
            super(view);
            letterFrom = view.findViewById(R.id.letterFrom);
            letterTheme = view.findViewById(R.id.letterTheme);
            letterBody = view.findViewById(R.id.letterBody);
            letterDate = view.findViewById(R.id.letterDate);
        }
    }
}
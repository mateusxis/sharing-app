package com.example.sharingapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

public class ContactsActivity extends AppCompatActivity {
    private ContactList contact_list = new ContactList();
    private ContactList active_borrowers_list = new ContactList();
    private  ItemList item_list = new ItemList();
    private ArrayAdapter<Contact> adapter = null;
    private Context context;

    public void addContactActivity(View view) {
        Intent intent = new Intent(this, AddContactActivity.class);
        startActivity(intent);
    }
}

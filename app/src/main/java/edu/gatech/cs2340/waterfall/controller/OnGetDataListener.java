package edu.gatech.cs2340.waterfall.controller;

import com.google.firebase.database.DataSnapshot;

/**
 * Created by Mo on 3/6/2017.
 */

interface OnGetDataListener {

    /**
     * define what happens on success
     * @param dataSnapshot snapshot of the data
     */
    void onSuccess(DataSnapshot dataSnapshot);

    /**
     * define what happens when start listening to data
     */
    void onStart();

    /**
     * define what happens of failure of retrieving data
     */
    void onFailure();
}

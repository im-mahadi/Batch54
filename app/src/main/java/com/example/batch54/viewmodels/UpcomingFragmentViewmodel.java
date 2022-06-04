package com.example.batch54.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.batch54.models.UpcomingModel;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;

public class UpcomingFragmentViewmodel extends ViewModel {
    private final FirebaseFirestore db = FirebaseFirestore.getInstance();

    private final MutableLiveData<Boolean> _isSucceed = new MutableLiveData<>();
    public LiveData<Boolean> isSucceed() {
        return _isSucceed;
    }

    private final MutableLiveData<Boolean> _isFailed = new MutableLiveData<>();
    public LiveData<Boolean> isFailed() {
        return _isFailed;
    }

    private final MutableLiveData<ArrayList<UpcomingModel>> _upcomingEvents = new MutableLiveData<>();
    public LiveData<ArrayList<UpcomingModel>> upcomingEvents() {
        return _upcomingEvents;
    }

    public void setUpcomingEvents() {
        db.collection("upcoming")
                .get()
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        _isSucceed.setValue(true);

                        ArrayList<UpcomingModel> list = new ArrayList<>();
                        for (QueryDocumentSnapshot document : task.getResult()) {
                            list.add(new UpcomingModel(
                                    document.getString("Title"),
                                    document.getString("Date"),
                                    document.getString("Details")
                            ));
                        }
                        _upcomingEvents.setValue(list);
                    } else {
                        _isFailed.setValue(true);
                    }
                });
    }
}

package com.example.instaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        private void loadDataToUi() {
//            pb.setVisibility(View.VISIBLE);
//            FirebaseRecyclerOptions<Photos> options=new FirebaseRecyclerOptions.Builder<Photos>()
//                    .setQuery(mPhotosDatabase,Photos.class)
//                    .build();
//
//            ///here stuffs
//
//            FirebaseRecyclerAdapter<Photos,PhotosViewHolder> adapter=new FirebaseRecyclerAdapter<Photos, PhotosViewHolder>(options) {
//                @Override
//                protected void onBindViewHolder(@NonNull final PhotosViewHolder holder, int position, @NonNull final Photos model) {
//
//                    holder.tvPost.setText(model.getPostdetails());
//                    pb.setVisibility(View.GONE);
//                    Picasso.get().load(model.getPostimage()).placeholder(R.drawable.photo).into(holder.postImage);
//                    //holder.tvViews.setText("  "+model.getPostviews());
//                    //holder.tvComments.setText("  "+"0");
//
//                    final String postId=model.getPostid();
//                    holder.tvLikes.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            mPhotosDatabase.child(postId).child("postlikes").child(userId).setValue(1);
//                        }
//                    });
//                    holder.postImage.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            mPhotosDatabase.child(postId).child("postviews").child(userId).setValue(1);
//                        }
//                    });
//                    holder.tvComments.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            mPhotosDatabase.child(postId).child("postcomments").child(userId).setValue("Loving this");
//                        }
//                    });
//                    mPhotosDatabase.child(postId).child("postlikes").addValueEventListener(new ValueEventListener() {
//                        @Override
//                        public void onDataChange(DataSnapshot dataSnapshot) {
//
//                            int likes= (int) dataSnapshot.getChildrenCount();
//                            holder.tvLikes.setText("  "+likes);
//                        }
//
//                        @Override
//                        public void onCancelled(DatabaseError databaseError) {
//
//                            Toast.makeText(HomeActivity.this, "Error: "+databaseError, Toast.LENGTH_SHORT).show();
//                        }
//                    });
//                    mPhotosDatabase.child(postId).child("postviews").addValueEventListener(new ValueEventListener() {
//                        @Override
//                        public void onDataChange(DataSnapshot dataSnapshot) {
//
//                            int views= (int) dataSnapshot.getChildrenCount();
//                            holder.tvViews.setText("  "+views);
//                        }
//
//                        @Override
//                        public void onCancelled(DatabaseError databaseError) {
//
//                            Toast.makeText(HomeActivity.this, "Error: "+databaseError, Toast.LENGTH_SHORT).show();
//                        }
//                    });
//                    mPhotosDatabase.child(postId).child("postcomments").addValueEventListener(new ValueEventListener() {
//                        @Override
//                        public void onDataChange(DataSnapshot dataSnapshot) {
//
//                            int coms= (int) dataSnapshot.getChildrenCount();
//                            holder.tvComments.setText("  "+coms);
//                        }
//
//                        @Override
//                        public void onCancelled(DatabaseError databaseError) {
//
//                            Toast.makeText(HomeActivity.this, "Error: "+databaseError, Toast.LENGTH_SHORT).show();
//                        }
//                    });
//
//
//
//
//
//                }
//
//                @NonNull
//                @Override
//                public PhotosViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//
//                    View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.single_photo,viewGroup,false);
//                    PhotosViewHolder viewHolder=new PhotosViewHolder(view);
//                    return viewHolder;
//                }
//            };
//
//            photoList.setAdapter(adapter);
//            adapter.startListening();
//
//
//            //here again
//
//
//        }
    }
}
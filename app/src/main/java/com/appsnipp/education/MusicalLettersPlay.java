package com.appsnipp.education;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

public class MusicalLettersPlay {
    private static final String TAG = "txtview";
    MediaPlayer mla , mlb ,mlc ,mld ,mle, mlf ,mlg , mlh , mli,mlj,mlk,mll,mlm,mln,mlo,mlp,mlq,mlr,mls,mlt,mlu,mlv,mlw,mlx,mly,mlz;
    Context ctx;

    public MusicalLettersPlay(Context ctx) {
        this.ctx = ctx;
        init();
    }

    public MusicalLettersPlay() {
    }

    public void init()
    {
        mla = MediaPlayer.create(ctx, R.raw.a);
        mlb = MediaPlayer.create(ctx, R.raw.b);
        mlc = MediaPlayer.create(ctx, R.raw.c);
        mld = MediaPlayer.create(ctx, R.raw.d);
        mle = MediaPlayer.create(ctx, R.raw.e);
        mlf = MediaPlayer.create(ctx, R.raw.f);
        mlg = MediaPlayer.create(ctx, R.raw.g);
        mlh = MediaPlayer.create(ctx, R.raw.h);
        mli = MediaPlayer.create(ctx, R.raw.i);
        mlj = MediaPlayer.create(ctx, R.raw.j);
        mlk = MediaPlayer.create(ctx, R.raw.k);
        mll = MediaPlayer.create(ctx, R.raw.l);
        mlm = MediaPlayer.create(ctx, R.raw.m);
        mln = MediaPlayer.create(ctx, R.raw.n);
        mlo = MediaPlayer.create(ctx, R.raw.o);
        mlp = MediaPlayer.create(ctx, R.raw.p);
        mlq = MediaPlayer.create(ctx, R.raw.q);
        mlr = MediaPlayer.create(ctx, R.raw.r);
        mls = MediaPlayer.create(ctx, R.raw.s);
        mlt = MediaPlayer.create(ctx, R.raw.t);
        mlu = MediaPlayer.create(ctx, R.raw.u);
        mlv = MediaPlayer.create(ctx, R.raw.v);
        mlw = MediaPlayer.create(ctx, R.raw.w);
        mlx = MediaPlayer.create(ctx, R.raw.x);
        mly = MediaPlayer.create(ctx, R.raw.y);
        mlz = MediaPlayer.create(ctx, R.raw.z);
    }


    public void playById(int id)
    {

        stopCurrentPlay();

        switch (id){
            case (R.id.a):
                Log.d(TAG, "onClick: c1 started");

                mla.start();
                break;
            case (R.id.b):
                Log.d(TAG, "onClick: c1 started");
                mlb.start();
                break;
            case (R.id.c):
                Log.d(TAG, "onClick: c1 started");
                mlc.start();
                break;
            case (R.id.d):
                Log.d(TAG, "onClick: c1 started");
                mld.start();
                break;
            case (R.id.e):
                Log.d(TAG, "onClick: c1 started");
                mle.start();
                break;
            case (R.id.f):
                Log.d(TAG, "onClick: c1 started");
                mlf.start();
                break;
            case (R.id.g):
                Log.d(TAG, "onClick: c1 started");
                mlg.start();
                break;
            case (R.id.h):
                Log.d(TAG, "onClick: c1 started");
                mlh.start();
                break;
            case (R.id.i):
                Log.d(TAG, "onClick: c1 started");
                mli.start();
                break;
            case (R.id.j):
                Log.d(TAG, "onClick: c1 started");
                mlj.start();
                break;
            case (R.id.k):
                Log.d(TAG, "onClick: c1 started");
                mlk.start();
                break;
            case (R.id.l):
                Log.d(TAG, "onClick: c1 started");
                mll.start();
                break;
            case (R.id.m):
                Log.d(TAG, "onClick: c1 started");
                mlm.start();
                break;
            case (R.id.n):
                Log.d(TAG, "onClick: c1 started");
                mln.start();
                break;
            case (R.id.o):
                Log.d(TAG, "onClick: c1 started");
                mlo.start();
                break;
            case (R.id.p):
                Log.d(TAG, "onClick: c1 started");
                mlp.start();
                break;
            case (R.id.q):
                Log.d(TAG, "onClick: c1 started");
                mlq.start();
                break;
            case (R.id.r):
                Log.d(TAG, "onClick: c1 started");
                mlr.start();
                break;
            case (R.id.s):
                Log.d(TAG, "onClick: c1 started");
                mls.start();
                break;
            case (R.id.t):
                Log.d(TAG, "onClick: c1 started");
                mlt.start();
                break;
            case (R.id.u):
                Log.d(TAG, "onClick: c1 started");
                mlu.start();
                break;
            case (R.id.v):
                Log.d(TAG, "onClick: c1 started");
                mlv.start();
                break;
            case (R.id.w):
                Log.d(TAG, "onClick: c1 started");
                mlw.start();
                break;
            case (R.id.x):
                Log.d(TAG, "onClick: c1 started");
                mlx.start();
                break;
            case (R.id.y):
                Log.d(TAG, "onClick: c1 started");
                mly.start();
                break;
            case (R.id.z):
                Log.d(TAG, "onClick: c1 started");
                mlz.start();
                break;

        }

    }
    public void stopCurrentPlay()
    {
        if(mla.isPlaying())
        {

            mla.pause();
            mla.seekTo(0);
        }
        else if(mlb.isPlaying())
        {
            mlb.pause();
            mlb.seekTo(0);
        }
        else if(mlc.isPlaying())
        {
            mlc.pause();
            mlc.seekTo(0);
        }
        else if(mld.isPlaying())
        {
            mld.pause();
            mld.seekTo(0);
        }
        else if(mle.isPlaying())
        {
            mle.pause();
            mle.seekTo(0);
        }
        else if(mlf.isPlaying())
        {
            mlf.pause();
            mlf.seekTo(0);
        }
        else if(mlg.isPlaying())
        {
            mlg.pause();
            mlg.seekTo(0);
        }
        else if(mlh.isPlaying())
        {
            mlh.pause();
            mlh.seekTo(0);
        }
        else if(mli.isPlaying())
        {
            mli.pause();
            mli.seekTo(0);
        }
        else if(mlj.isPlaying())
        {
            mlj.pause();
            mlj.seekTo(0);
        }
        else if(mlk.isPlaying())
        {
            mlk.pause();
            mlk.seekTo(0);
        }
        else if(mll.isPlaying())
        {
            mll.pause();
            mll.seekTo(0);
        }
        else if(mlm.isPlaying())
        {
            mlm.pause();
            mlm.seekTo(0);
        }
        else if(mln.isPlaying())
        {
            mln.pause();
            mln.seekTo(0);
        }
        else if(mlo.isPlaying())
        {
            mlo.pause();
            mlo.seekTo(0);
        }
        else if(mlp.isPlaying())
        {
            mlp.pause();
            mlp.seekTo(0);
        }
        else if(mlq.isPlaying())
        {
            mlq.pause();
            mlq.seekTo(0);
        }
        else if(mlr.isPlaying())
        {
            mlr.pause();
            mlr.seekTo(0);
        }
        else if(mls.isPlaying())
        {
            mls.pause();
            mls.seekTo(0);
        }
        else if(mlt.isPlaying())
        {
            mlt.pause();
            mlt.seekTo(0);
        }
        else if(mlu.isPlaying())
        {
            mlu.pause();
            mlu.seekTo(0);
        }
        else if(mlv.isPlaying())
        {
            mlv.pause();
            mlv.seekTo(0);
        }
        else if(mlw.isPlaying())
        {
            mlw.pause();
            mlw.seekTo(0);
        }
        else if(mlx.isPlaying())
        {
            mlx.pause();
            mlx.seekTo(0);
        }
        else if(mly.isPlaying())
        {
            mly.pause();
            mly.seekTo(0);
        }
        else if(mlz.isPlaying())
        {
            mlz.pause();
            mlz.seekTo(0);
        }
    }

}

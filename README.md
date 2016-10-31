# Siasat

Project Latihan Membuat Animasi mengunakan Canvas , , , Aplikasi ini hanya berisikan animasi login , , tidak di sertakan menu utama dan menu lainnya, karena fokus dari Repositori ini hanya di bagian animasi LOGIN

##Sample Sourcecode
````
protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        switch (mStatus) {
            case STATUS_LOGIN:
                canvas.drawText(mLoginText, (mWidth - getTextWidth(mLoginText)) / 2, (mHeight + getTextHeight(mLoginText)) / 2, mPaint);
                break;

            case STATUS_LOGGING:
                canvas.drawText(mLoginText, (mWidth - getTextWidth(mLoginText)) / 2, (mHeight + getTextHeight(mLoginText)) / 2, mPaint);
                canvas.drawLine((mWidth - getTextWidth(mLoginText)) / 2, mHeight, (mWidth - getTextWidth(mLoginText)) / 2 + mLineWidth, mHeight, mPaint);
                break;

            case STATUS_LOGIN_SUCCESS:
                mPaint.setAlpha(mLoginTextAlpha);
                canvas.drawText(mLoginText, mSuccessTextX + getTextWidth(mSuccessText) + DensityUtil.dp2px(getContext(), 10), (mHeight + getTextHeight(mLoginText)) / 2, mPaint);

                mPaint.setAlpha(255 - mLoginTextAlpha);
                canvas.drawText(mSuccessText, mSuccessTextX, (mHeight + getTextHeight(mSuccessText)) / 2, mPaint);

                mPaint.setAlpha(255);
                canvas.drawLine((mWidth - getTextWidth(mSuccessText)) / 2, mHeight, (mWidth + getTextWidth(mSuccessText)) / 2, mHeight, mPaint);
                break;
        }
    }
````

##Demo Aplikasi
![demosiasatanimasi](https://github.com/Danboru/Siasat/blob/master/images/siasatanimasi.gif?raw=true)

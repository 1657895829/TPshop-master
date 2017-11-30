//
// DO NOT EDIT THIS FILE.Generated using AndroidAnnotations 3.3.2.
//  You can create a larger work that contains this file and distribute that work under terms of your choice.
//


package com.soubao.tpshop.activity.person.address;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build.VERSION_CODES;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.TextView;
import com.soubao.tpshop.R.id;
import com.soubao.tpshop.R.layout;
import com.soubao.tpshop.view.SwitchButton;
import org.androidannotations.api.SdkVersionHelper;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class SPConsigneeAddressEditActivity_
    extends SPConsigneeAddressEditActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.consignee_address_edit);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static SPConsigneeAddressEditActivity_.IntentBuilder_ intent(Context context) {
        return new SPConsigneeAddressEditActivity_.IntentBuilder_(context);
    }

    public static SPConsigneeAddressEditActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new SPConsigneeAddressEditActivity_.IntentBuilder_(fragment);
    }

    public static SPConsigneeAddressEditActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new SPConsigneeAddressEditActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (((SdkVersionHelper.getSdkInt()< 5)&&(keyCode == KeyEvent.KEYCODE_BACK))&&(event.getRepeatCount() == 0)) {
            onBackPressed();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        consigneeEdtv = ((EditText) hasViews.findViewById(id.consignee_name_edtv));
        addressEdtv = ((EditText) hasViews.findViewById(id.consignee_address_edtv));
        mobileEdtv = ((EditText) hasViews.findViewById(id.consignee_mobile_edtv));
        setdefaultSth = ((SwitchButton) hasViews.findViewById(id.consignee_setdefault_sth));
        regionTxtv = ((TextView) hasViews.findViewById(id.consignee_region_txtv));
        {
            View view = hasViews.findViewById(id.submit_btn);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        SPConsigneeAddressEditActivity_.this.onViewClick(view);
                    }

                }
                );
            }
        }
        if (regionTxtv!= null) {
            regionTxtv.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    SPConsigneeAddressEditActivity_.this.onViewClick(view);
                }

            }
            );
        }
        init();
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<SPConsigneeAddressEditActivity_.IntentBuilder_>
    {

        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, SPConsigneeAddressEditActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), SPConsigneeAddressEditActivity_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), SPConsigneeAddressEditActivity_.class);
            fragmentSupport_ = fragment;
        }

        @Override
        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent, requestCode);
            } else {
                if (fragment_!= null) {
                    if (VERSION.SDK_INT >= VERSION_CODES.JELLY_BEAN) {
                        fragment_.startActivityForResult(intent, requestCode, lastOptions);
                    } else {
                        fragment_.startActivityForResult(intent, requestCode);
                    }
                } else {
                    if (context instanceof Activity) {
                        Activity activity = ((Activity) context);
                        ActivityCompat.startActivityForResult(activity, intent, requestCode, lastOptions);
                    } else {
                        if (VERSION.SDK_INT >= VERSION_CODES.JELLY_BEAN) {
                            context.startActivity(intent, lastOptions);
                        } else {
                            context.startActivity(intent);
                        }
                    }
                }
            }
        }

    }

}

//
// DO NOT EDIT THIS FILE.Generated using AndroidAnnotations 3.3.2.
//  You can create a larger work that contains this file and distribute that work under terms of your choice.
//


package com.soubao.tpshop.activity.shop;

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
import android.widget.LinearLayout;
import android.widget.TextView;
import com.soubao.tpshop.R.id;
import com.soubao.tpshop.R.layout;
import com.soubao.tpshop.view.SPArrowRowView;
import com.soubao.tpshop.view.SwitchButton;
import org.androidannotations.api.SdkVersionHelper;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class SPConfirmOrderActivity_
    extends SPConfirmOrderActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.order_confirm_order);
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

    public static SPConfirmOrderActivity_.IntentBuilder_ intent(Context context) {
        return new SPConfirmOrderActivity_.IntentBuilder_(context);
    }

    public static SPConfirmOrderActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new SPConfirmOrderActivity_.IntentBuilder_(fragment);
    }

    public static SPConfirmOrderActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new SPConfirmOrderActivity_.IntentBuilder_(supportFragment);
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
        deliverAview = ((SPArrowRowView) hasViews.findViewById(id.order_deliver_aview));
        buyTimeTxtv = ((TextView) hasViews.findViewById(id.buy_time_txtv));
        payfeeTxtv = ((TextView) hasViews.findViewById(id.payfee_txtv));
        addressTxtv = ((TextView) hasViews.findViewById(id.order_address_txtv));
        feeShoppingTxtv = ((TextView) hasViews.findViewById(id.fee_shopping_txtv));
        feeCouponTxtv = ((TextView) hasViews.findViewById(id.fee_coupon_txtv));
        consigneeTxtv = ((TextView) hasViews.findViewById(id.order_consignee_txtv));
        couponAview = ((SPArrowRowView) hasViews.findViewById(id.order_coupon_aview));
        feeBalanceTxtv = ((TextView) hasViews.findViewById(id.fee_balance_txtv));
        feeAmountTxtv = ((TextView) hasViews.findViewById(id.fee_amount_txtv));
        pointSth = ((SwitchButton) hasViews.findViewById(id.order_point_sth));
        invoceAview = ((SPArrowRowView) hasViews.findViewById(id.order_invoce_aview));
        feeGoodsFeeTxtv = ((TextView) hasViews.findViewById(id.fee_goodsfee_txtv));
        feePointTxtv = ((TextView) hasViews.findViewById(id.fee_point_txtv));
        mGallery = ((LinearLayout) hasViews.findViewById(id.product_list_gallery_lyaout));
        balanceTxtv = ((TextView) hasViews.findViewById(id.order_balance_txtv));
        productCountTxtv = ((TextView) hasViews.findViewById(id.order_product_count_txtv));
        pointTxtv = ((TextView) hasViews.findViewById(id.order_point_txtv));
        bananceSth = ((SwitchButton) hasViews.findViewById(id.order_balance_sth));
        if (deliverAview!= null) {
            deliverAview.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    SPConfirmOrderActivity_.this.onButtonClick(view);
                }

            }
            );
        }
        if (couponAview!= null) {
            couponAview.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    SPConfirmOrderActivity_.this.onButtonClick(view);
                }

            }
            );
        }
        if (invoceAview!= null) {
            invoceAview.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    SPConfirmOrderActivity_.this.onButtonClick(view);
                }

            }
            );
        }
        {
            View view = hasViews.findViewById(id.pay_btn);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        SPConfirmOrderActivity_.this.onButtonClick(view);
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.order_confirm_consignee_layout);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        SPConfirmOrderActivity_.this.onButtonClick(view);
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.order_product_flayout);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        SPConfirmOrderActivity_.this.onButtonClick(view);
                    }

                }
                );
            }
        }
        init();
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<SPConfirmOrderActivity_.IntentBuilder_>
    {

        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, SPConfirmOrderActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), SPConfirmOrderActivity_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), SPConfirmOrderActivity_.class);
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

package com.kitcenter.runners.classwork.lesson5;

import com.kitcenter.app.classwork.NarrowingCasting;
import com.kitcenter.app.classwork.WideningCasting;

/**
 * Created by Marina on 5/3/17.
 */
public class WideningCastingRunner {
    public static void main(String[] args) {
        WideningCasting wideningCasting = new WideningCasting();
        wideningCasting.widening();
        NarrowingCasting narrowingCasting = new NarrowingCasting();
    narrowingCasting.narrowing();
      narrowingCasting.narrowingCasting();
      narrowingCasting.castingDoubleInFloat();

    }

}

package com.kitcenter.runners.classwork.lesson4;

import com.kitcenter.app.classwork.lesson4.NarrowingCasting;
import com.kitcenter.app.classwork.lesson4.WideningCasting;

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

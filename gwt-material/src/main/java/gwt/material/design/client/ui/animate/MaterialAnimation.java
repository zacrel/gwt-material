/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.client.ui.animate;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.jquery.client.api.Functions;

/**
 * Stateful object holding animation details.
 * Default behaviour is a bounce transition for 800ms.
 */
public class MaterialAnimation {

    private Widget widget;
    private Transition transition = Transition.BOUNCE;
    private int delayMillis = 0;
    private int durationMillis = 800;
    private boolean infinite;

    public MaterialAnimation() {
    }

    public MaterialAnimation transition(Transition transition) {
        this.transition = transition;
        return this;
    }

    public MaterialAnimation delayMillis(int delayMillis) {
        this.delayMillis = delayMillis;
        return this;
    }


    public MaterialAnimation durationMillis(int durationMillis) {
        this.durationMillis = durationMillis;
        return this;
    }

    public MaterialAnimation infinite(boolean infinite) {
        this.infinite = infinite;
        return this;
    }

    public void animate(Widget widget) {
        this.widget = widget;
        animate(widget, null);
    }

    public void animate(Widget widget, Functions.Func callback) {
        this.widget = widget;
        MaterialAnimator.animate(transition, widget, delayMillis, durationMillis, callback, infinite);
    }

    public Widget getWidget() {
        return widget;
    }

    public Transition getTransition() {
        return transition;
    }

    public int getDelayMillis() {
        return delayMillis;
    }

    public int getDurationMillis() {
        return durationMillis;
    }

    public boolean isInfinite() {
        return infinite;
    }
}

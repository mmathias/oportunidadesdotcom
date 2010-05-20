/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package NavegacaoHandler;

import com.sun.faces.application.NavigationHandlerImpl;
import javax.faces.application.ViewHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

/**
 *
 * @author User
 */
public class NavegacaoHandler extends NavigationHandlerImpl{

    private static final String prefix = "def:";
    public NavegacaoHandler() {
        super();
    }

    /**
     * Override the default navigation handler to check for viewIds in
     * the outcome string.
     * This is how the path looks like
     * return "def:privado/cadastramento/formCadastramento";
     */
    @Override
    public void handleNavigation(FacesContext context, String fromAction,
                                 String outcome) {
        if (outcome != null && outcome.startsWith(prefix)) {

            // canonicalize path relative to current view
            String dir = "/";
            outcome = outcome.replace(prefix, dir);

            String defaultSuffix = context.getExternalContext().getInitParameter(ViewHandler.DEFAULT_SUFFIX_PARAM_NAME);
            String suffix = defaultSuffix != null ? defaultSuffix : ViewHandler.DEFAULT_SUFFIX;

            outcome += suffix;

            // set the specified view
            ViewHandler vh = context.getApplication().getViewHandler();
            UIViewRoot view = vh.createView(context, outcome);
            context.setViewRoot(view);
        } else {
            super.handleNavigation(context, fromAction, outcome);
        }
    }

}

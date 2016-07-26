package xyz.mpacin.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@HippoEssentialsGenerated(internalName = "mpacinhippo:simpledocument")
@Node(jcrType = "mpacinhippo:simpledocument")
public class Simpledocument extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "mpacinhippo:title")
    public String getTitle() {
        return getProperty("mpacinhippo:title");
    }

    @HippoEssentialsGenerated(internalName = "mpacinhippo:content")
    public HippoHtml getContent() {
        return getHippoHtml("mpacinhippo:content");
    }
}

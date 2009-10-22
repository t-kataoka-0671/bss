/**
 *
 */
package cish_sys.web.sampleS2Dao;

/**
 * S2Daoサンプルプログラム Page.
 *
 * @author CIS furukawa
 */
public class SampleS2DaoPage {

    private String messages;

    /**
     * 初期化処理
     * @return
     */
    public Class<?> initialize() {
	messages = "初期表示";
	return null;
    }

    /**
     * レンダリング処理
     * @return
     */
    public Class<?> prerender() {
	return null;
    }

    public String getMessages() {
	return messages;
    }

    public void setMessages(String messages) {
	this.messages = messages;
    }

}

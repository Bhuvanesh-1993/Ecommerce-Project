package list;

import java.sql.SQLException;

public interface IViewList
{
	void setPresenter(IPresenterList prese) throws SQLException;
	public int checkTheS_No();
}

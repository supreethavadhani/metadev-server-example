package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.DbField;
import org.simplity.fm.core.data.Schema;
import org.simplity.fm.core.validn.IValidation;
import org.simplity.fm.core.data.DbAssistant;
import org.simplity.fm.core.service.IServiceContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import org.simplity.fm.core.data.ColumnType;
import org.simplity.fm.core.validn.DependentListValidation;
import org.simplity.fm.test.gen.DefinedDataTypes;

/**
 * class that represents structure of forgotPassword
 */ 
public class ForgotPasswordSchema extends Schema {	private static final DbField[] FIELDS = {
	};
	private static final  boolean[] OPS = {true, false, true, false, true, false};
	private static final String SELECT = "SELECT  FROM forgot_password";
	private static final int[] SELECT_IDX = {};
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public ForgotPasswordSchema() {
		this.name = "forgotPassword";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "forgot_password";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(0, null, SELECT, this.getParams(SELECT_IDX));
		this.initialize();
	}

	@Override
	public ForgotPasswordData newSchemaData() {
		return new ForgotPasswordData(this, null);
	}

	@Override
	protected ForgotPasswordData newSchemaData(final Object[] data) {
		return new ForgotPasswordData(this, data);
	}

	@Override
	public ForgotPasswordData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (ForgotPasswordData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public ForgotPasswordData parseKeys(JsonObject json, IServiceContext ctx) {
		return (ForgotPasswordData) super.parseKeys(json, ctx);
	}

	@Override
	public ForgotPasswordDataTable newSchemaDataTable() {
		return new ForgotPasswordDataTable(this, null);
	}

	@Override
	protected ForgotPasswordDataTable newSchemaDataTable(final Object[][] data) {
		return new ForgotPasswordDataTable(this, data);
	}

	@Override
	public ForgotPasswordDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (ForgotPasswordDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}

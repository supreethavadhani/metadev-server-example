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
 * class that represents structure of staffRegistration
 */ 
public class StaffRegistrationSchema extends Schema {	private static final DbField[] FIELDS = {
	};
	private static final  boolean[] OPS = {true, true, true, false, true, false};
	private static final String SELECT = "SELECT  FROM staff_registration";
	private static final int[] SELECT_IDX = {};
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public StaffRegistrationSchema() {
		this.name = "staffRegistration";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "staff_registration";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(0, null, SELECT, this.getParams(SELECT_IDX));
		this.initialize();
	}

	@Override
	public StaffRegistrationData newSchemaData() {
		return new StaffRegistrationData(this, null);
	}

	@Override
	protected StaffRegistrationData newSchemaData(final Object[] data) {
		return new StaffRegistrationData(this, data);
	}

	@Override
	public StaffRegistrationData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (StaffRegistrationData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public StaffRegistrationData parseKeys(JsonObject json, IServiceContext ctx) {
		return (StaffRegistrationData) super.parseKeys(json, ctx);
	}

	@Override
	public StaffRegistrationDataTable newSchemaDataTable() {
		return new StaffRegistrationDataTable(this, null);
	}

	@Override
	protected StaffRegistrationDataTable newSchemaDataTable(final Object[][] data) {
		return new StaffRegistrationDataTable(this, data);
	}

	@Override
	public StaffRegistrationDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (StaffRegistrationDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}

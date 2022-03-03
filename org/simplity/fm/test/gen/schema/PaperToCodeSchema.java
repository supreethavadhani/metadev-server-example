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
 * class that represents structure of paperToCode
 */ 
public class PaperToCodeSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectRegisterId", 0, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.RequiredData), 
			new DbField("studentId", 1, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {false, false, false, false, true, false};
	private static final String SELECT = "SELECT subject_register_id, student_id FROM exam_attendees";
	private static final int[] SELECT_IDX = {0, 1};
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public PaperToCodeSchema() {
		this.name = "paperToCode";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "exam_attendees";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(2, null, SELECT, this.getParams(SELECT_IDX));
		this.initialize();
	}

	@Override
	public PaperToCodeData newSchemaData() {
		return new PaperToCodeData(this, null);
	}

	@Override
	protected PaperToCodeData newSchemaData(final Object[] data) {
		return new PaperToCodeData(this, data);
	}

	@Override
	public PaperToCodeData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (PaperToCodeData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public PaperToCodeData parseKeys(JsonObject json, IServiceContext ctx) {
		return (PaperToCodeData) super.parseKeys(json, ctx);
	}

	@Override
	public PaperToCodeDataTable newSchemaDataTable() {
		return new PaperToCodeDataTable(this, null);
	}

	@Override
	protected PaperToCodeDataTable newSchemaDataTable(final Object[][] data) {
		return new PaperToCodeDataTable(this, data);
	}

	@Override
	public PaperToCodeDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (PaperToCodeDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}

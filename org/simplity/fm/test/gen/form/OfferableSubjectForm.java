package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.ComponentProvider;
import org.simplity.fm.core.data.Form;
import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.LinkedForm;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.SchemaData;
import org.simplity.fm.core.data.SchemaDataTable;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import org.simplity.fm.core.service.IServiceContext;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.test.gen.schema.OfferableSubjectData;
import org.simplity.fm.test.gen.schema.OfferableSubjectDataTable;
/** class for form offerableSubject  */
public class OfferableSubjectForm extends Form {
	protected static final String NAME = "offerableSubject";
	protected static final String SCHEMA = "offerableSubject";
	protected static final  boolean[] OPS = {true, false, false, false, true, false};
/** constructor */
public OfferableSubjectForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public OfferableSubjectFd newFormData() {
		return new OfferableSubjectFd(this, null, null, null);
	}

	@Override
	public OfferableSubjectFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (OfferableSubjectFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public OfferableSubjectFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (OfferableSubjectFd)super.parseKeys(json, ctx);
	}

	@Override
	public OfferableSubjectFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (OfferableSubjectFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public OfferableSubjectFdt newFormDataTable() {
		return new OfferableSubjectFdt(this, null, null, null);
	}

	@Override
	public OfferableSubjectFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new OfferableSubjectFd(this, (OfferableSubjectData) schemaData, values, data);
	}

	@Override
	public OfferableSubjectFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new OfferableSubjectFdt(this, (OfferableSubjectDataTable) table, values, linkedData);
	}
}

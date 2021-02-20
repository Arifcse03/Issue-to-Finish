package mnj.mfg.model.lov;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu May 05 19:05:54 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FillSizeVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Attribute1 {
            public Object get(FillSizeVORowImpl obj) {
                return obj.getAttribute1();
            }

            public void put(FillSizeVORowImpl obj, Object value) {
                obj.setAttribute1((String)value);
            }
        }
        ,
        SizeInseam {
            public Object get(FillSizeVORowImpl obj) {
                return obj.getSizeInseam();
            }

            public void put(FillSizeVORowImpl obj, Object value) {
                obj.setSizeInseam((String)value);
            }
        }
        ,
        Quantity {
            public Object get(FillSizeVORowImpl obj) {
                return obj.getQuantity();
            }

            public void put(FillSizeVORowImpl obj, Object value) {
                obj.setQuantity((Number)value);
            }
        }
        ,
        HeaderId {
            public Object get(FillSizeVORowImpl obj) {
                return obj.getHeaderId();
            }

            public void put(FillSizeVORowImpl obj, Object value) {
                obj.setHeaderId((Number)value);
            }
        }
        ,
        StyleName {
            public Object get(FillSizeVORowImpl obj) {
                return obj.getStyleName();
            }

            public void put(FillSizeVORowImpl obj, Object value) {
                obj.setStyleName((String)value);
            }
        }
        ,
        Attribute2 {
            public Object get(FillSizeVORowImpl obj) {
                return obj.getAttribute2();
            }

            public void put(FillSizeVORowImpl obj, Object value) {
                obj.setAttribute2((String)value);
            }
        }
        ,
        Buyer {
            public Object get(FillSizeVORowImpl obj) {
                return obj.getBuyer();
            }

            public void put(FillSizeVORowImpl obj, Object value) {
                obj.setBuyer((String)value);
            }
        }
        ,
        Season {
            public Object get(FillSizeVORowImpl obj) {
                return obj.getSeason();
            }

            public void put(FillSizeVORowImpl obj, Object value) {
                obj.setSeason((String)value);
            }
        }
        ,
        Bpo {
            public Object get(FillSizeVORowImpl obj) {
                return obj.getBpo();
            }

            public void put(FillSizeVORowImpl obj, Object value) {
                obj.setBpo((String)value);
            }
        }
        ,
        Color {
            public Object get(FillSizeVORowImpl obj) {
                return obj.getColor();
            }

            public void put(FillSizeVORowImpl obj, Object value) {
                obj.setColor((String)value);
            }
        }
        ,
        Sizee {
            public Object get(FillSizeVORowImpl obj) {
                return obj.getSizee();
            }

            public void put(FillSizeVORowImpl obj, Object value) {
                obj.setSizee((String)value);
            }
        }
        ,
        Inseme {
            public Object get(FillSizeVORowImpl obj) {
                return obj.getInseme();
            }

            public void put(FillSizeVORowImpl obj, Object value) {
                obj.setInseme((String)value);
            }
        }
        ,
        InseamSizeConcat {
            public Object get(FillSizeVORowImpl obj) {
                return obj.getInseamSizeConcat();
            }

            public void put(FillSizeVORowImpl obj, Object value) {
                obj.setInseamSizeConcat((String)value);
            }
        }
        ,
        ShippingInstructions {
            public Object get(FillSizeVORowImpl obj) {
                return obj.getShippingInstructions();
            }

            public void put(FillSizeVORowImpl obj, Object value) {
                obj.setShippingInstructions((String)value);
            }
        }
        ,
        CustPoNumber {
            public Object get(FillSizeVORowImpl obj) {
                return obj.getCustPoNumber();
            }

            public void put(FillSizeVORowImpl obj, Object value) {
                obj.setCustPoNumber((String)value);
            }
        }
        ,
        SFLAG {
            public Object get(FillSizeVORowImpl obj) {
                return obj.getSFLAG();
            }

            public void put(FillSizeVORowImpl obj, Object value) {
                obj.setSFLAG((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(FillSizeVORowImpl object);

        public abstract void put(FillSizeVORowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ATTRIBUTE1 = AttributesEnum.Attribute1.index();
    public static final int SIZEINSEAM = AttributesEnum.SizeInseam.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int STYLENAME = AttributesEnum.StyleName.index();
    public static final int ATTRIBUTE2 = AttributesEnum.Attribute2.index();
    public static final int BUYER = AttributesEnum.Buyer.index();
    public static final int SEASON = AttributesEnum.Season.index();
    public static final int BPO = AttributesEnum.Bpo.index();
    public static final int COLOR = AttributesEnum.Color.index();
    public static final int SIZEE = AttributesEnum.Sizee.index();
    public static final int INSEME = AttributesEnum.Inseme.index();
    public static final int INSEAMSIZECONCAT = AttributesEnum.InseamSizeConcat.index();
    public static final int SHIPPINGINSTRUCTIONS = AttributesEnum.ShippingInstructions.index();
    public static final int CUSTPONUMBER = AttributesEnum.CustPoNumber.index();
    public static final int SFLAG = AttributesEnum.SFLAG.index();

    /**
     * This is the default constructor (do not remove).
     */
    public FillSizeVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Attribute1.
     * @return the Attribute1
     */
    public String getAttribute1() {
        return (String) getAttributeInternal(ATTRIBUTE1);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Attribute1.
     * @param value value to set the  Attribute1
     */
    public void setAttribute1(String value) {
        setAttributeInternal(ATTRIBUTE1, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SizeInseam.
     * @return the SizeInseam
     */
    public String getSizeInseam() {
        return (String) getAttributeInternal(SIZEINSEAM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SizeInseam.
     * @param value value to set the  SizeInseam
     */
    public void setSizeInseam(String value) {
        setAttributeInternal(SIZEINSEAM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Quantity.
     * @return the Quantity
     */
    public Number getQuantity() {
        return (Number) getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Quantity.
     * @param value value to set the  Quantity
     */
    public void setQuantity(Number value) {
        setAttributeInternal(QUANTITY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute HeaderId.
     * @return the HeaderId
     */
    public Number getHeaderId() {
        return (Number) getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute HeaderId.
     * @param value value to set the  HeaderId
     */
    public void setHeaderId(Number value) {
        setAttributeInternal(HEADERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute StyleName.
     * @return the StyleName
     */
    public String getStyleName() {
        return (String) getAttributeInternal(STYLENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute StyleName.
     * @param value value to set the  StyleName
     */
    public void setStyleName(String value) {
        setAttributeInternal(STYLENAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Attribute2.
     * @return the Attribute2
     */
    public String getAttribute2() {
        return (String) getAttributeInternal(ATTRIBUTE2);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Attribute2.
     * @param value value to set the  Attribute2
     */
    public void setAttribute2(String value) {
        setAttributeInternal(ATTRIBUTE2, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Buyer.
     * @return the Buyer
     */
    public String getBuyer() {
        return (String) getAttributeInternal(BUYER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Buyer.
     * @param value value to set the  Buyer
     */
    public void setBuyer(String value) {
        setAttributeInternal(BUYER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Season.
     * @return the Season
     */
    public String getSeason() {
        return (String) getAttributeInternal(SEASON);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Season.
     * @param value value to set the  Season
     */
    public void setSeason(String value) {
        setAttributeInternal(SEASON, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Bpo.
     * @return the Bpo
     */
    public String getBpo() {
        return (String) getAttributeInternal(BPO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Bpo.
     * @param value value to set the  Bpo
     */
    public void setBpo(String value) {
        setAttributeInternal(BPO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Color.
     * @return the Color
     */
    public String getColor() {
        return (String) getAttributeInternal(COLOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Color.
     * @param value value to set the  Color
     */
    public void setColor(String value) {
        setAttributeInternal(COLOR, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Sizee.
     * @return the Sizee
     */
    public String getSizee() {
        return (String) getAttributeInternal(SIZEE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Sizee.
     * @param value value to set the  Sizee
     */
    public void setSizee(String value) {
        setAttributeInternal(SIZEE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Inseme.
     * @return the Inseme
     */
    public String getInseme() {
        return (String) getAttributeInternal(INSEME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Inseme.
     * @param value value to set the  Inseme
     */
    public void setInseme(String value) {
        setAttributeInternal(INSEME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute InseamSizeConcat.
     * @return the InseamSizeConcat
     */
    public String getInseamSizeConcat() {
        return (String) getAttributeInternal(INSEAMSIZECONCAT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute InseamSizeConcat.
     * @param value value to set the  InseamSizeConcat
     */
    public void setInseamSizeConcat(String value) {
        setAttributeInternal(INSEAMSIZECONCAT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ShippingInstructions.
     * @return the ShippingInstructions
     */
    public String getShippingInstructions() {
        return (String) getAttributeInternal(SHIPPINGINSTRUCTIONS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ShippingInstructions.
     * @param value value to set the  ShippingInstructions
     */
    public void setShippingInstructions(String value) {
        setAttributeInternal(SHIPPINGINSTRUCTIONS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CustPoNumber.
     * @return the CustPoNumber
     */
    public String getCustPoNumber() {
        return (String) getAttributeInternal(CUSTPONUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CustPoNumber.
     * @param value value to set the  CustPoNumber
     */
    public void setCustPoNumber(String value) {
        setAttributeInternal(CUSTPONUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SFLAG.
     * @return the SFLAG
     */
    public String getSFLAG() {
        return (String) getAttributeInternal(SFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SFLAG.
     * @param value value to set the  SFLAG
     */
    public void setSFLAG(String value) {
        setAttributeInternal(SFLAG, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
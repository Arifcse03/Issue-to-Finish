package mnj.mfg.model.lov;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu May 05 18:10:04 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FillBPOVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        BuyerId {
            public Object get(FillBPOVORowImpl obj) {
                return obj.getBuyerId();
            }

            public void put(FillBPOVORowImpl obj, Object value) {
                obj.setBuyerId((Number)value);
            }
        }
        ,
        BuyerName {
            public Object get(FillBPOVORowImpl obj) {
                return obj.getBuyerName();
            }

            public void put(FillBPOVORowImpl obj, Object value) {
                obj.setBuyerName((String)value);
            }
        }
        ,
        Season {
            public Object get(FillBPOVORowImpl obj) {
                return obj.getSeason();
            }

            public void put(FillBPOVORowImpl obj, Object value) {
                obj.setSeason((String)value);
            }
        }
        ,
        Attribute1 {
            public Object get(FillBPOVORowImpl obj) {
                return obj.getAttribute1();
            }

            public void put(FillBPOVORowImpl obj, Object value) {
                obj.setAttribute1((String)value);
            }
        }
        ,
        Attribute2 {
            public Object get(FillBPOVORowImpl obj) {
                return obj.getAttribute2();
            }

            public void put(FillBPOVORowImpl obj, Object value) {
                obj.setAttribute2((String)value);
            }
        }
        ,
        Attribute3 {
            public Object get(FillBPOVORowImpl obj) {
                return obj.getAttribute3();
            }

            public void put(FillBPOVORowImpl obj, Object value) {
                obj.setAttribute3((String)value);
            }
        }
        ,
        WashName {
            public Object get(FillBPOVORowImpl obj) {
                return obj.getWashName();
            }

            public void put(FillBPOVORowImpl obj, Object value) {
                obj.setWashName((String)value);
            }
        }
        ,
        Quantity {
            public Object get(FillBPOVORowImpl obj) {
                return obj.getQuantity();
            }

            public void put(FillBPOVORowImpl obj, Object value) {
                obj.setQuantity((Number)value);
            }
        }
        ,
        StyleName {
            public Object get(FillBPOVORowImpl obj) {
                return obj.getStyleName();
            }

            public void put(FillBPOVORowImpl obj, Object value) {
                obj.setStyleName((String)value);
            }
        }
        ,
        TransactionType {
            public Object get(FillBPOVORowImpl obj) {
                return obj.getTransactionType();
            }

            public void put(FillBPOVORowImpl obj, Object value) {
                obj.setTransactionType((String)value);
            }
        }
        ,
        PocId {
            public Object get(FillBPOVORowImpl obj) {
                return obj.getPocId();
            }

            public void put(FillBPOVORowImpl obj, Object value) {
                obj.setPocId((Number)value);
            }
        }
        ,
        CurrentBpo {
            public Object get(FillBPOVORowImpl obj) {
                return obj.getCurrentBpo();
            }

            public void put(FillBPOVORowImpl obj, Object value) {
                obj.setCurrentBpo((String)value);
            }
        }
        ,
        BpoNo {
            public Object get(FillBPOVORowImpl obj) {
                return obj.getBpoNo();
            }

            public void put(FillBPOVORowImpl obj, Object value) {
                obj.setBpoNo((String)value);
            }
        }
        ,
        OrderedQty {
            public Object get(FillBPOVORowImpl obj) {
                return obj.getOrderedQty();
            }

            public void put(FillBPOVORowImpl obj, Object value) {
                obj.setOrderedQty((Number)value);
            }
        }
        ,
        Stn {
            public Object get(FillBPOVORowImpl obj) {
                return obj.getStn();
            }

            public void put(FillBPOVORowImpl obj, Object value) {
                obj.setStn((String)value);
            }
        }
        ,
        Color {
            public Object get(FillBPOVORowImpl obj) {
                return obj.getColor();
            }

            public void put(FillBPOVORowImpl obj, Object value) {
                obj.setColor((String)value);
            }
        }
        ,
        Flag {
            public Object get(FillBPOVORowImpl obj) {
                return obj.getFlag();
            }

            public void put(FillBPOVORowImpl obj, Object value) {
                obj.setFlag((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(FillBPOVORowImpl object);

        public abstract void put(FillBPOVORowImpl object, Object value);

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


    public static final int BUYERID = AttributesEnum.BuyerId.index();
    public static final int BUYERNAME = AttributesEnum.BuyerName.index();
    public static final int SEASON = AttributesEnum.Season.index();
    public static final int ATTRIBUTE1 = AttributesEnum.Attribute1.index();
    public static final int ATTRIBUTE2 = AttributesEnum.Attribute2.index();
    public static final int ATTRIBUTE3 = AttributesEnum.Attribute3.index();
    public static final int WASHNAME = AttributesEnum.WashName.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int STYLENAME = AttributesEnum.StyleName.index();
    public static final int TRANSACTIONTYPE = AttributesEnum.TransactionType.index();
    public static final int POCID = AttributesEnum.PocId.index();
    public static final int CURRENTBPO = AttributesEnum.CurrentBpo.index();
    public static final int BPONO = AttributesEnum.BpoNo.index();
    public static final int ORDEREDQTY = AttributesEnum.OrderedQty.index();
    public static final int STN = AttributesEnum.Stn.index();
    public static final int COLOR = AttributesEnum.Color.index();
    public static final int FLAG = AttributesEnum.Flag.index();

    /**
     * This is the default constructor (do not remove).
     */
    public FillBPOVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute BuyerId.
     * @return the BuyerId
     */
    public Number getBuyerId() {
        return (Number) getAttributeInternal(BUYERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BuyerId.
     * @param value value to set the  BuyerId
     */
    public void setBuyerId(Number value) {
        setAttributeInternal(BUYERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BuyerName.
     * @return the BuyerName
     */
    public String getBuyerName() {
        return (String) getAttributeInternal(BUYERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BuyerName.
     * @param value value to set the  BuyerName
     */
    public void setBuyerName(String value) {
        setAttributeInternal(BUYERNAME, value);
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
     * Gets the attribute value for the calculated attribute CurrentBpo.
     * @return the CurrentBpo
     */
    public String getCurrentBpo() {
        return (String) getAttributeInternal(CURRENTBPO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CurrentBpo.
     * @param value value to set the  CurrentBpo
     */
    public void setCurrentBpo(String value) {
        setAttributeInternal(CURRENTBPO, value);
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
     * Gets the attribute value for the calculated attribute Attribute3.
     * @return the Attribute3
     */
    public String getAttribute3() {
        return (String) getAttributeInternal(ATTRIBUTE3);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Attribute3.
     * @param value value to set the  Attribute3
     */
    public void setAttribute3(String value) {
        setAttributeInternal(ATTRIBUTE3, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WashName.
     * @return the WashName
     */
    public String getWashName() {
        return (String) getAttributeInternal(WASHNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WashName.
     * @param value value to set the  WashName
     */
    public void setWashName(String value) {
        setAttributeInternal(WASHNAME, value);
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
     * Gets the attribute value for the calculated attribute BpoNo.
     * @return the BpoNo
     */
    public String getBpoNo() {
        return (String) getAttributeInternal(BPONO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BpoNo.
     * @param value value to set the  BpoNo
     */
    public void setBpoNo(String value) {
        setAttributeInternal(BPONO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrderedQty.
     * @return the OrderedQty
     */
    public Number getOrderedQty() {
        return (Number) getAttributeInternal(ORDEREDQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrderedQty.
     * @param value value to set the  OrderedQty
     */
    public void setOrderedQty(Number value) {
        setAttributeInternal(ORDEREDQTY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Stn.
     * @return the Stn
     */
    public String getStn() {
        return (String) getAttributeInternal(STN);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Stn.
     * @param value value to set the  Stn
     */
    public void setStn(String value) {
        setAttributeInternal(STN, value);
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
     * Gets the attribute value for the calculated attribute TransactionType.
     * @return the TransactionType
     */
    public String getTransactionType() {
        return (String) getAttributeInternal(TRANSACTIONTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransactionType.
     * @param value value to set the  TransactionType
     */
    public void setTransactionType(String value) {
        setAttributeInternal(TRANSACTIONTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PocId.
     * @return the PocId
     */
    public Number getPocId() {
        return (Number) getAttributeInternal(POCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PocId.
     * @param value value to set the  PocId
     */
    public void setPocId(Number value) {
        setAttributeInternal(POCID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Flag.
     * @return the Flag
     */
    public String getFlag() {
        return (String) getAttributeInternal(FLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Flag.
     * @param value value to set the  Flag
     */
    public void setFlag(String value) {
        setAttributeInternal(FLAG, value);
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

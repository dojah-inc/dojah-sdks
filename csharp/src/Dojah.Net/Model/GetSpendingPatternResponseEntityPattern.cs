/*
 * DOJAH APIs
 *
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Dojah.Net.Client.OpenAPIDateConverter;

namespace Dojah.Net.Model
{
    /// <summary>
    /// GetSpendingPatternResponseEntityPattern
    /// </summary>
    [DataContract(Name = "GetSpendingPatternResponse_entity_pattern")]
    public partial class GetSpendingPatternResponseEntityPattern : IEquatable<GetSpendingPatternResponseEntityPattern>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetSpendingPatternResponseEntityPattern" /> class.
        /// </summary>
        /// <param name="others">others.</param>
        /// <param name="food">food.</param>
        /// <param name="airtimeData">airtimeData.</param>
        /// <param name="bankTransfer">bankTransfer.</param>
        /// <param name="charges">charges.</param>
        public GetSpendingPatternResponseEntityPattern(GetSpendingPatternResponseEntityPatternOthers others = default(GetSpendingPatternResponseEntityPatternOthers), GetSpendingPatternResponseEntityPatternFood food = default(GetSpendingPatternResponseEntityPatternFood), GetSpendingPatternResponseEntityPatternAirtimeData airtimeData = default(GetSpendingPatternResponseEntityPatternAirtimeData), GetSpendingPatternResponseEntityPatternBankTransfer bankTransfer = default(GetSpendingPatternResponseEntityPatternBankTransfer), GetSpendingPatternResponseEntityPatternCharges charges = default(GetSpendingPatternResponseEntityPatternCharges))
        {
            this.Others = others;
            this.Food = food;
            this.AirtimeData = airtimeData;
            this.BankTransfer = bankTransfer;
            this.Charges = charges;
        }

        /// <summary>
        /// Gets or Sets Others
        /// </summary>
        [DataMember(Name = "Others", EmitDefaultValue = false)]
        public GetSpendingPatternResponseEntityPatternOthers Others { get; set; }

        /// <summary>
        /// Gets or Sets Food
        /// </summary>
        [DataMember(Name = "Food", EmitDefaultValue = false)]
        public GetSpendingPatternResponseEntityPatternFood Food { get; set; }

        /// <summary>
        /// Gets or Sets AirtimeData
        /// </summary>
        [DataMember(Name = "Airtime/Data", EmitDefaultValue = false)]
        public GetSpendingPatternResponseEntityPatternAirtimeData AirtimeData { get; set; }

        /// <summary>
        /// Gets or Sets BankTransfer
        /// </summary>
        [DataMember(Name = "Bank Transfer", EmitDefaultValue = false)]
        public GetSpendingPatternResponseEntityPatternBankTransfer BankTransfer { get; set; }

        /// <summary>
        /// Gets or Sets Charges
        /// </summary>
        [DataMember(Name = "Charges", EmitDefaultValue = false)]
        public GetSpendingPatternResponseEntityPatternCharges Charges { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetSpendingPatternResponseEntityPattern {\n");
            sb.Append("  Others: ").Append(Others).Append("\n");
            sb.Append("  Food: ").Append(Food).Append("\n");
            sb.Append("  AirtimeData: ").Append(AirtimeData).Append("\n");
            sb.Append("  BankTransfer: ").Append(BankTransfer).Append("\n");
            sb.Append("  Charges: ").Append(Charges).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as GetSpendingPatternResponseEntityPattern);
        }

        /// <summary>
        /// Returns true if GetSpendingPatternResponseEntityPattern instances are equal
        /// </summary>
        /// <param name="input">Instance of GetSpendingPatternResponseEntityPattern to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetSpendingPatternResponseEntityPattern input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Others == input.Others ||
                    (this.Others != null &&
                    this.Others.Equals(input.Others))
                ) && 
                (
                    this.Food == input.Food ||
                    (this.Food != null &&
                    this.Food.Equals(input.Food))
                ) && 
                (
                    this.AirtimeData == input.AirtimeData ||
                    (this.AirtimeData != null &&
                    this.AirtimeData.Equals(input.AirtimeData))
                ) && 
                (
                    this.BankTransfer == input.BankTransfer ||
                    (this.BankTransfer != null &&
                    this.BankTransfer.Equals(input.BankTransfer))
                ) && 
                (
                    this.Charges == input.Charges ||
                    (this.Charges != null &&
                    this.Charges.Equals(input.Charges))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Others != null)
                {
                    hashCode = (hashCode * 59) + this.Others.GetHashCode();
                }
                if (this.Food != null)
                {
                    hashCode = (hashCode * 59) + this.Food.GetHashCode();
                }
                if (this.AirtimeData != null)
                {
                    hashCode = (hashCode * 59) + this.AirtimeData.GetHashCode();
                }
                if (this.BankTransfer != null)
                {
                    hashCode = (hashCode * 59) + this.BankTransfer.GetHashCode();
                }
                if (this.Charges != null)
                {
                    hashCode = (hashCode * 59) + this.Charges.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
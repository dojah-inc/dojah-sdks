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
    /// GetSpendingPatternResponseEntityPatternOthers
    /// </summary>
    [DataContract(Name = "GetSpendingPatternResponse_entity_pattern_Others")]
    public partial class GetSpendingPatternResponseEntityPatternOthers : IEquatable<GetSpendingPatternResponseEntityPatternOthers>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetSpendingPatternResponseEntityPatternOthers" /> class.
        /// </summary>
        /// <param name="sum">sum.</param>
        /// <param name="count">count.</param>
        /// <param name="percentage">percentage.</param>
        public GetSpendingPatternResponseEntityPatternOthers(decimal sum = default(decimal), decimal count = default(decimal), decimal percentage = default(decimal))
        {
            this.Sum = sum;
            this.Count = count;
            this.Percentage = percentage;
        }

        /// <summary>
        /// Gets or Sets Sum
        /// </summary>
        [DataMember(Name = "sum", EmitDefaultValue = false)]
        public decimal Sum { get; set; }

        /// <summary>
        /// Gets or Sets Count
        /// </summary>
        [DataMember(Name = "count", EmitDefaultValue = false)]
        public decimal Count { get; set; }

        /// <summary>
        /// Gets or Sets Percentage
        /// </summary>
        [DataMember(Name = "percentage", EmitDefaultValue = false)]
        public decimal Percentage { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetSpendingPatternResponseEntityPatternOthers {\n");
            sb.Append("  Sum: ").Append(Sum).Append("\n");
            sb.Append("  Count: ").Append(Count).Append("\n");
            sb.Append("  Percentage: ").Append(Percentage).Append("\n");
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
            return this.Equals(input as GetSpendingPatternResponseEntityPatternOthers);
        }

        /// <summary>
        /// Returns true if GetSpendingPatternResponseEntityPatternOthers instances are equal
        /// </summary>
        /// <param name="input">Instance of GetSpendingPatternResponseEntityPatternOthers to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetSpendingPatternResponseEntityPatternOthers input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Sum == input.Sum ||
                    this.Sum.Equals(input.Sum)
                ) && 
                (
                    this.Count == input.Count ||
                    this.Count.Equals(input.Count)
                ) && 
                (
                    this.Percentage == input.Percentage ||
                    this.Percentage.Equals(input.Percentage)
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
                hashCode = (hashCode * 59) + this.Sum.GetHashCode();
                hashCode = (hashCode * 59) + this.Count.GetHashCode();
                hashCode = (hashCode * 59) + this.Percentage.GetHashCode();
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
